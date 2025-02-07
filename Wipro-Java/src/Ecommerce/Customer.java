package Ecommerce;

class Customer {
 public double calculateDiscount(double price) {
	 return price;
 }
}

class RegularCustomer extends Customer {
	@Override
	public double calculateDiscount(double price) {
     return price * 0.90;
     }
}

class PremiumCustomer extends Customer {
	@Override
	public double calculateDiscount(double price) {
    return price * 0.80;
    }
}

class Employee extends Customer {
	@Override
	public double calculateDiscount(double price) {
    return price * 0.70;
    }
}
