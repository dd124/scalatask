package com.damyan

import com.damyan.Type.Type
import com.damyan.Warmth.Warmth

object Warmth extends Enumeration {
  type Warmth = Value
  val Hot, Cold = Value
}

object Type extends Enumeration {
  type Type = Value
  val Food, Beverage = Value
}

case class Item(name: String, warmth: Warmth, itemType: Type, price: Double)
