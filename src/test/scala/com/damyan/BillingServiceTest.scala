package com.damyan

import org.scalatest.FunSuite


class BillingServiceTest extends FunSuite {

  test("processBill should return value of type Double") {
    val itemList = List(
      Item("Coke", Warmth.Cold, Type.Beverage, 1.0),
      Item("Burger", Warmth.Hot, Type.Food, 5.0),
      Item("Coffee", Warmth.Hot, Type.Beverage, 1.50)
    )

    assert(BillingService.processBill(itemList).isInstanceOf[Double])
  }
}
