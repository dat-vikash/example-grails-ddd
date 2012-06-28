package example.shipping

import grails.plugins.springsecurity.Secured


@Secured(['ROLE_SHIPPING_USER'])
class ShipmentController {
	static scaffold = Shipment
}
