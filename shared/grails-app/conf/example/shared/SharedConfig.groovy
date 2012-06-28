package example.shared

// Always throw a grails.validation.ValidationException if validation fails during a save
grails.gorm.failOnError = true

// Added by the Spring Security Core plugin
grails.plugins.springsecurity.userLookup.userDomainClassName = 'example.shared.security.User'
grails.plugins.springsecurity.userLookup.authorityJoinClassName = 'example.shared.security.UserRole'
grails.plugins.springsecurity.authority.className = 'example.shared.security.Role'

