package example.crm

class Customer {

	String firstName
	String lastName

	static constraints = {
		firstName blank:false
		lastName blank: false
	}
}
