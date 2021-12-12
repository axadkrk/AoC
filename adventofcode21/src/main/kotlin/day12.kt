import java.util.*


fun main() {
    val testData0 = arrayOf(
        "start-A", "start-b", "A-c", "A-b", "b-d", "A-end", "b-end"
    )
    val testData = arrayOf(
        "dc-end", "HN-start", "start-kj", "dc-start", "dc-HN", "LN-dc", "HN-end", "kj-sa", "kj-HN", "kj-dc"
    )

    val realData = arrayOf(
        "bm-XY",
        "ol-JS",
        "bm-im",
        "RD-ol",
        "bm-QI",
        "JS-ja",
        "im-gq",
        "end-im",
        "ja-ol",
        "JS-gq",
        "bm-AF",
        "RD-start",
        "RD-ja",
        "start-ol",
        "cj-bm",
        "start-JS",
        "AF-ol",
        "end-QI",
        "QI-gq",
        "ja-gq",
        "end-AF",
        "im-QI",
        "bm-gq",
        "ja-QI",
        "gq-RD"
    )

    calc1Map(testData0)
    calc1Map(testData)
    calc1Map(realData)
}


fun calc1Map(data: Array<String>) {
    val nodeMap = HashMap<String, Node>()
    data.forEach { line ->
        val split = line.split("-")
        val s0 = split[0]
        val s1 = split[1]

        addNodes(nodeMap, s0, s1)
    }

    val startNode = nodeMap["start"]
    val endNode = nodeMap["end"]

    if (startNode != null && endNode != null) {
        startNode.isBig = false
        val paths = mutableListOf<MutableList<Node>>()
        searchPath(startNode, paths)
//        paths.forEach { path -> println(path) }

        println(paths.size)
    }
}

fun searchPathHelp(
    node: Node,
    path: MutableList<Node>,
    incomplete: MutableList<MutableList<Node>>,
    paths: MutableList<MutableList<Node>>
) {
    if (path.last().name != "end") {
        node.children.forEach { child ->
//            if(node.name == "start" && child.name == "b")
            if (containsSmall(path, child)) {
                val newPath = path.toMutableList()
                newPath.add(child)
                incomplete.add(newPath)
                searchPathHelp(child, newPath, incomplete, paths)
            }
        }
    } else {
        paths.add(path)
    }
}

fun containsSmall(path: MutableList<Node>, child: Node): Boolean {
    if (child.isBig)
        return true
    if (child.name == "start") {
        return false
    }
    if (child.name == "end") {
        return path.count { pe -> pe.name == child.name } < 1
    }

    if (hasTwice(path)) {
        return path.count { pe -> pe.name == child.name } < 1
    }

    return path.count { pe -> pe.name == child.name } < 2
}

fun hasTwice(path: MutableList<Node>): Boolean {
    val groupBy =
        path.filter { node -> !node.isBig && node.name != "start" && node.name != "end" }.groupBy { node -> node.name }

//    if (list != null) {
//        return list.size > 1
//    }

    return groupBy.filter { group -> group.value.size > 1 }.isNotEmpty()
}

fun searchPath(node: Node, paths: MutableList<MutableList<Node>>): Any {
    val path = mutableListOf<Node>()
    val incomplete = mutableListOf<MutableList<Node>>()

    path.add(node)
    searchPathHelp(node, path, incomplete, paths)
    return path
}


private fun addNodes(nodeMap: HashMap<String, Node>, s0: String, s1: String) {
    if (!nodeMap.containsKey(s0)) {
        nodeMap[s0] = Node(s0, checkUppercase(s0))
    }
    val node0 = nodeMap[s0]

    if (!nodeMap.containsKey(s1)) {
        nodeMap[s1] = Node(s1, checkUppercase(s1))
    }
    val node1 = nodeMap[s1]

    if (node1 != null) {
        node0?.children?.add(node1)
    }
    if (node0 != null) {
        node1?.children?.add(node0)
    }
}

fun checkUppercase(s0: String): Boolean {
    return s0.all { char -> char.isUpperCase() }
}

class Node(val name: String, var isBig: Boolean) {
    val children = mutableListOf<Node>()

    override fun toString(): String {
        return name
    }
}