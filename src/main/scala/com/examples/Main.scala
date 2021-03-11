package com.examples

object Main {
  def main(args: Array[String]): Unit = {
    
    val items = Seq(
        Item(name = "Gauntlets of Str", durability = 20, slot = "hands"),
        Item(name = "Gauntlets of Int", durability = 10, slot = "hands"),
      	Item(name = "Gauntlets of Dex", durability = 15, slot = "hands"),
    )
      
    items.map(item => {
      println(item)
      println(s"\nitem's id: ${item.id}")
      println(s"\nitem's name: ${item.name}")
    })
    
    // id szerint lekérdezhető dictionary (map)
    val itemsbyId = items.map(item => (item.id, item)).toMap
    
    println("\nid szerint lekérdezhető dictionary (map):")
    
    itemsbyId.map(itemById => println(itemById))
    
    //példa id szerinti lekérdezésre a dictionaryből:
    println("\nA harmadik item neve: " + itemsbyId(3).name)
  }
}

object Item{
  var idCounter: Int = 0
  
  def nextId = {
    idCounter = idCounter + 1
    idCounter
  }
}

case class Item(
  name: String,
  durability: Int = 0,
  slot: String
){
  val id = Item.nextId
}