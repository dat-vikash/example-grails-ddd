package example.crm

import grails.plugins.springsecurity.Secured


@Secured(['ROLE_CRM_USER'])
class CustomerController {
	static scaffold = Customer
}
