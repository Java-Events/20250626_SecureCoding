Additionally, a correlation token should be included with each request, for example, 
as a UUID in the X-Correlation-ID-Header, allowing REST calls to be traced across 
multiple systems. This can also be encapsulated centrally in the adapter:

private HttpRequest.Builder withCorrelation(HttpRequest.Builder builder) {
return builder.header("X-Correlation-ID", UUID.randomUUID().toString());
}