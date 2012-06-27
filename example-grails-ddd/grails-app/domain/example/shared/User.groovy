package example.shared

class User {

	String username

	static constraints = {
		username blank: false, unique: true
	}
}
