<%@ page import="example.sales.Client" %>



<div class="fieldcontain ${hasErrors(bean: clientInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="client.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${clientInstance?.firstName}" />
</div>

<div class="fieldcontain ${hasErrors(bean: clientInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="client.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${clientInstance?.lastName}" />
</div>

