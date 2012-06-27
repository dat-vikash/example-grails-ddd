<%@ page import="example.shipping.Shipment" %>



<div class="fieldcontain ${hasErrors(bean: shipmentInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="shipment.status.label" default="Status" />
		
	</label>
	<g:select name="status" from="${example.shipping.Shipment$ShippingStatus?.values()}" keys="${example.shipping.Shipment$ShippingStatus.values()*.name()}" required="" value="${shipmentInstance?.status?.name()}"/>
</div>

