import example.shared.security.Role
import example.shared.security.User
import example.shared.security.UserRole

class BootStrap {

	def init = { servletContext ->
		def adminUser = new User(username: 'admin', password: 'password', enabled: true).save()
		def powerUser = new User(username: 'power', password: 'password', enabled: true).save()
		def salesUser = new User(username: 'sales', password: 'password', enabled: true).save()

		def adminRole = new Role(authority: 'ROLE_ADMIN').save()

		def crmRole = new Role(authority: 'ROLE_CRM_USER').save()
		def salesRole = new Role(authority: 'ROLE_SALES_USER').save()
		def shippingRole = new Role(authority: 'ROLE_SHIPPING_USER').save()

		def moduleRoles = [
			crmRole,
			salesRole,
			shippingRole
		]

		new UserRole(user: adminUser, role: adminRole).save()
		new UserRole(user: salesUser, role: salesRole).save()

		moduleRoles.each {
			new UserRole(user: powerUser, role: it).save()
		}
	}

	def destroy = {
	}
}
