fun main(args:Array<String>)
{
    val list= arrayListOf<String>("f","t","v","b","a")
    val newList= arrayListOf<String>("fa","ta","va","ba","aa")

    list.add("saa")

    list.remove("f")

    list.indexOf("t")

    list.addAll(newList)

    list.removeAll(newList)

//    list.clear()




    println(list.contains("f"))


}