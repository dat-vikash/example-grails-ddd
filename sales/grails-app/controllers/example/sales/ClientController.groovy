package example.sales

import grails.plugins.springsecurity.Secured

@Secured(['ROLE_SALES_USER'])
class ClientController {
	static scaffold = Client
}
