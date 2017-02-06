package com.damyan

object BillingService {

  def processBill(items: List[Item]): Double = {
    val itemsTotal: Double = items.map(_.price).sum
    val hasFood = items.exists(i => i.itemType.equals(Type.Food))
    var serviceCharge = 0.0

    if (hasFood) {
      serviceCharge = itemsTotal/10

      val hasHotFood = items.exists(i => i.warmth.equals(Warmth.Hot))

      if (hasHotFood) {
        serviceCharge += itemsTotal/5
      }
    }
    if (serviceCharge > 20) itemsTotal + 20
    else itemsTotal + serviceCharge
  }
}
