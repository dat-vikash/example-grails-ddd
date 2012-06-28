import example.shared.security.Role
import example.shared.security.User
import example.shared.security.UserRole

class BootStrap {

	def init = { servletContext ->
		def adminUser = new User(username: 'admin', password: 'password', enabled: true).save()
		def user = new User(username: 'user', password: 'password', enabled: true).save()
		def crmUser = new User(username: 'crm', password: 'password', enabled: true).save()
		def salesUser = new User(username: 'sales', password: 'password', enabled: true).save()
		def shippingUser = new User(username: 'shipping', password: 'password', enabled: true).save()

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

		moduleRoles.each {
			new UserRole(user: user, role: it).save()
		}

		new UserRole(user: crmUser, role: crmRole).save()
		new UserRole(user: salesUser, role: salesRole).save()
		new UserRole(user: shippingUser, role: shippingRole).save()
	}

	def destroy = {
	}
}
