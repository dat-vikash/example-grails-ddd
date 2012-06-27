package example.sales

class Client {

	String firstName
	String lastName

	static constraints = {
		firstName blank: false
		lastName blank: false
	}
}
