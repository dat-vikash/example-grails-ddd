package example.shipping

import grails.plugins.springsecurity.Secured

@Secured(['ROLE_SHIPMENT_USER'])
class ShipmentController {
	static scaffold = Shipment
}
