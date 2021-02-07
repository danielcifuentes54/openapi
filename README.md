# OPEN API

## what's an API

Application programming interface, an API is a central point where two computer applications can speak to each other

## REST

Representation State Transfer

## RESTful terminology

- HTTP verbs: GET, POST, PUT, DELETE
- Messages: Payload
- URI: Uniform Resource Identifier
- URL: Uniform Resource Location
- Idempotence
- Stateless: service doesn't maintain any client state
- HATEOAS: Hypermedia As The Engine Of Application State, dynamically links to discover all the available actions and resources

## OPENAPI

Is a widely adopted standard for describing APIs is considered technology agnostic

- Specifications are defined in YAML or JSON
- It's a structured document that can be read programmatically
- It's a single source of truth for the APIs

## OPENAPI OBJECTS

|         |            |              |
| ------- | ---------- | ------------ |
|         | info       |              |
| servers |            | security     |
|         | paths      |              |
| tags    |            | externalDocs |
|         | components |              |

Reference: [OpenAPI specification Object](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.1.0.md#oasObject)

## OPENAPI 3.0 DATA TYPES

- integer
- number
- string
- object

Note: OpenAPI specification is based on the JSON schema

Reference: [OpenAPI Data Types](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.1.0.md#dataTypes)

## OPENAPI COMPONENTS OBJECT

Allow us to define common objects to reuse them.

Reference: [OpenAPI Components Object](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.1.0.md#componentsObject)

## OPENAPI PARAMETERS OBJECT

Allow us to define four diferents parameters like:

- path
- query
- header
- cookie

Reference: [OpenAPI Parameters Object](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.1.0.md#parameterObject)

## OPENAPI SECURITY SCHEME OBJECT

Allow us define a security scheme that can be used by the operations.

Reference: [OpenAPI Security Scheme Object](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.1.0.md#securitySchemeObject)

## OPENAPI GENERATOR

Reference: [OpenAPI Generator](https://openapi-generator.tech)
