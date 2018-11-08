package com.company.team.model.type;

import com.company.team.utility.Extensions;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public enum HttpStatusCode implements EnumField<HttpStatusCode> {

    SC_CONTINUE(HttpServletResponse.SC_CONTINUE) {
        @Override
        public String getDescription() {
            return "The server has received the request headers and the client should proceed to send the request body (in the case of a request for which a body needs to be sent; for example, a POST request). Sending a large request body to a server after a request has been rejected for inappropriate headers would be inefficient. To have a server check the request's headers, a client must send Expect: 100-continue as a header in its initial request and receive a 100 Continue status code in response before sending the body. If the client receives an error code such as 403 (Forbidden) or 405 (Method Not Allowed) then it shouldn't send the request's body. The response 417 Expectation Failed indicates that the request should be repeated without the Expect header as it indicates that the server doesn't support expectations (this is the case, for example, of HTTP/1.0 servers).";
        }
    },

    SC_SWITCHING_PROTOCOLS(HttpServletResponse.SC_SWITCHING_PROTOCOLS) {
        @Override
        public String getDescription() {
            return "The requester has asked the server to switch protocols and the server has agreed to do so.";
        }
    },

    SC_OK(HttpServletResponse.SC_OK) {
        @Override
        public String getDescription() {
            return "Standard response for successful HTTP requests. The actual response will depend on the request method used. In a GET request, the response will contain an entity corresponding to the requested resource. In a POST request, the response will contain an entity describing or containing the result of the action.";
        }
    },

    SC_CREATED(HttpServletResponse.SC_CREATED) {
        @Override
        public String getDescription() {
            return "The request has been fulfilled, resulting in the creation of a new resource.";
        }
    },

    SC_ACCEPTED(HttpServletResponse.SC_ACCEPTED) {
        @Override
        public String getDescription() {
            return "The request has been accepted for processing, but the processing has not been completed. The request might or might not be eventually acted upon, and may be disallowed when processing occurs.";
        }
    },

    SC_NON_AUTHORITATIVE_INFORMATION(HttpServletResponse.SC_NON_AUTHORITATIVE_INFORMATION) {
        @Override
        public String getDescription() {
            return "The server is a transforming proxy (e.g. a Web accelerator) that received a 200 OK from its origin, but is returning a modified version of the origin's response.";
        }
    },

    SC_NO_CONTENT(HttpServletResponse.SC_NO_CONTENT) {
        @Override
        public String getDescription() {
            return "The server successfully processed the request and is not returning any content.";
        }
    },

    SC_RESET_CONTENT(HttpServletResponse.SC_RESET_CONTENT) {
        @Override
        public String getDescription() {
            return "The server successfully processed the request, but is not returning any content. Unlike a 204 response, this response requires that the requester reset the document view.";
        }
    },

    SC_PARTIAL_CONTENT(HttpServletResponse.SC_PARTIAL_CONTENT) {
        @Override
        public String getDescription() {
            return "The server is delivering only part of the resource (byte serving) due to a range header sent by the client. The range header is used by HTTP clients to enable resuming of interrupted downloads, or split a download into multiple simultaneous streams.";
        }
    },

    SC_MULTIPLE_CHOICES(HttpServletResponse.SC_MULTIPLE_CHOICES) {
        @Override
        public String getDescription() {
            return "Indicates multiple options for the resource from which the client may choose (via agent-driven content negotiation). For example, this code could be used to present multiple video format options, to list files with different filename extensions, or to suggest word-sense disambiguation.";
        }
    },

    SC_MOVED_PERMANENTLY(HttpServletResponse.SC_MOVED_PERMANENTLY) {
        @Override
        public String getDescription() {
            return "This and all future requests should be directed to the given URI.";
        }
    },

    SC_MOVED_TEMPORARILY(HttpServletResponse.SC_MOVED_TEMPORARILY) {
        @Override
        public String getDescription() {
            return "Tells the client to look at (browse to) another url. 302 has been superseded by 303 and 307. This is an example of industry practice contradicting the standard. The HTTP/1.0 specification (RFC 1945) required the client to perform a temporary redirect (the original describing phrase was \"Moved Temporarily\"), but popular browsers implemented 302 with the functionality of a 303 See Other. Therefore, HTTP/1.1 added status codes 303 and 307 to distinguish between the two behaviours. However, some Web applications and frameworks use the 302 status code as if it were the 303.";
        }
    },

    SC_FOUND(HttpServletResponse.SC_FOUND) {
        @Override
        public String getDescription() {
            return "Tells the client to look at (browse to) another url. 302 has been superseded by 303 and 307. This is an example of industry practice contradicting the standard. The HTTP/1.0 specification (RFC 1945) required the client to perform a temporary redirect (the original describing phrase was \"Moved Temporarily\"), but popular browsers implemented 302 with the functionality of a 303 See Other. Therefore, HTTP/1.1 added status codes 303 and 307 to distinguish between the two behaviours. However, some Web applications and frameworks use the 302 status code as if it were the 303.";
        }
    },

    SC_SEE_OTHER(HttpServletResponse.SC_SEE_OTHER) {
        @Override
        public String getDescription() {
            return "The response to the request can be found under another URI using the GET method. When received in response to a POST (or PUT/DELETE), the client should presume that the server has received the data and should issue a new GET request to the given URI.";
        }
    },

    SC_NOT_MODIFIED(HttpServletResponse.SC_NOT_MODIFIED) {
        @Override
        public String getDescription() {
            return "Indicates that the resource has not been modified since the version specified by the request headers If-Modified-Since or If-None-Match. In such case, there is no need to retransmit the resource since the client still has a previously-downloaded copy.";
        }
    },

    SC_USE_PROXY(HttpServletResponse.SC_USE_PROXY) {
        @Override
        public String getDescription() {
            return "The requested resource is available only through a proxy, the address for which is provided in the response. Many HTTP clients (such as Mozilla and Internet Explorer) do not correctly handle responses with this status code, primarily for security reasons.";
        }
    },

    SC_TEMPORARY_REDIRECT(HttpServletResponse.SC_TEMPORARY_REDIRECT) {
        @Override
        public String getDescription() {
            return "In this case, the request should be repeated with another URI; however, future requests should still use the original URI. In contrast to how 302 was historically implemented, the request method is not allowed to be changed when reissuing the original request. For example, a POST request should be repeated using another POST request.";
        }
    },

    SC_BAD_REQUEST(HttpServletResponse.SC_BAD_REQUEST) {
        @Override
        public String getDescription() {
            return "The server cannot or will not process the request due to an apparent client error (e.g., malformed request syntax, size too large, invalid request message framing, or deceptive request routing).";
        }
    },

    SC_UNAUTHORIZED(HttpServletResponse.SC_UNAUTHORIZED) {
        @Override
        public String getDescription() {
            return "Similar to 403 Forbidden, but specifically for use when authentication is required and has failed or has not yet been provided. The response must include a WWW-Authenticate header field containing a challenge applicable to the requested resource. See Basic access authentication and Digest access authentication. 401 semantically means \"unauthenticated\", i.e. the user does not have the necessary credentials. Note: Some sites incorrectly issue HTTP 401 when an IP address is banned from the website (usually the website domain) and that specific address is refused permission to access a website.";
        }
    },

    SC_PAYMENT_REQUIRED(HttpServletResponse.SC_PAYMENT_REQUIRED) {
        @Override
        public String getDescription() {
            return "Reserved for future use. The original intention was that this code might be used as part of some form of digital cash or micropayment scheme, as proposed for example by GNU Taler, but that has not yet happened, and this code is not usually used. Google Developers API uses this status if a particular developer has exceeded the daily limit on requests. Sipgate uses this code if an account does not have sufficient funds to start a call. Shopify uses this code when the store has not paid their fees and is temporarily disabled.";
        }
    },

    SC_FORBIDDEN(HttpServletResponse.SC_FORBIDDEN) {
        @Override
        public String getDescription() {
            return "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource, or may need an account of some sort.";
        }
    },

    SC_NOT_FOUND(HttpServletResponse.SC_NOT_FOUND) {
        @Override
        public String getDescription() {
            return "The requested resource could not be found but may be available in the future. Subsequent requests by the client are permissible.";
        }
    },

    SC_METHOD_NOT_ALLOWED(HttpServletResponse.SC_METHOD_NOT_ALLOWED) {
        @Override
        public String getDescription() {
            return "A request method is not supported for the requested resource; for example, a GET request on a form that requires data to be presented via POST, or a PUT request on a read-only resource.";
        }
    },

    SC_NOT_ACCEPTABLE(HttpServletResponse.SC_NOT_ACCEPTABLE) {
        @Override
        public String getDescription() {
            return "The requested resource is capable of generating only content not acceptable according to the Accept headers sent in the request. See Content negotiation.";
        }
    },

    SC_PROXY_AUTHENTICATION_REQUIRED(HttpServletResponse.SC_PROXY_AUTHENTICATION_REQUIRED) {
        @Override
        public String getDescription() {
            return "The client must first authenticate itself with the proxy.";
        }
    },

    SC_REQUEST_TIMEOUT(HttpServletResponse.SC_REQUEST_TIMEOUT) {
        @Override
        public String getDescription() {
            return "The server timed out waiting for the request. According to HTTP specifications: \"The client did not produce a request within the time that the server was prepared to wait. The client MAY repeat the request without modifications at any later time.\"";
        }
    },

    SC_CONFLICT(HttpServletResponse.SC_CONFLICT) {
        @Override
        public String getDescription() {
            return "Indicates that the request could not be processed because of conflict in the current state of the resource, such as an edit conflict between multiple simultaneous updates.";
        }
    },

    SC_GONE(HttpServletResponse.SC_GONE) {
        @Override
        public String getDescription() {
            return "Indicates that the resource requested is no longer available and will not be available again. This should be used when a resource has been intentionally removed and the resource should be purged. Upon receiving a 410 status code, the client should not request the resource in the future. Clients such as search engines should remove the resource from their indices. Most use cases do not require clients and search engines to purge the resource, and a \"404 Not Found\" may be used instead.";
        }
    },

    SC_LENGTH_REQUIRED(HttpServletResponse.SC_LENGTH_REQUIRED) {
        @Override
        public String getDescription() {
            return "The request did not specify the length of its content, which is required by the requested resource.";
        }
    },

    SC_PRECONDITION_FAILED(HttpServletResponse.SC_PRECONDITION_FAILED) {
        @Override
        public String getDescription() {
            return "The server does not meet one of the preconditions that the requester put on the request.";
        }
    },

    SC_REQUEST_ENTITY_TOO_LARGE(HttpServletResponse.SC_REQUEST_ENTITY_TOO_LARGE) {
        @Override
        public String getDescription() {
            return "The request is larger than the server is willing or able to process. Previously called \"Request Entity Too Large\".";
        }
    },

    SC_REQUEST_URI_TOO_LONG(HttpServletResponse.SC_REQUEST_URI_TOO_LONG) {
        @Override
        public String getDescription() {
            return "The URI provided was too long for the server to process. Often the result of too much data being encoded as a query-string of a GET request, in which case it should be converted to a POST request. Called \"Request-URI Too Long\" previously.";
        }
    },

    SC_UNSUPPORTED_MEDIA_TYPE(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE) {
        @Override
        public String getDescription() {
            return "";
        }
    },

    SC_REQUESTED_RANGE_NOT_SATISFIABLE(HttpServletResponse.SC_REQUESTED_RANGE_NOT_SATISFIABLE) {
        @Override
        public String getDescription() {
            return "The client has asked for a portion of the file (byte serving), but the server cannot supply that portion. For example, if the client asked for a part of the file that lies beyond the end of the file. Called \"Requested Range Not Satisfiable\" previously.";
        }
    },

    SC_EXPECTATION_FAILED(HttpServletResponse.SC_EXPECTATION_FAILED) {
        @Override
        public String getDescription() {
            return "The server cannot meet the requirements of the Expect request-header field.";
        }
    },

    SC_INTERNAL_SERVER_ERROR(HttpServletResponse.SC_INTERNAL_SERVER_ERROR) {
        @Override
        public String getDescription() {
            return "A generic error message, given when an unexpected condition was encountered and no more specific message is suitable.";
        }
    },

    SC_NOT_IMPLEMENTED(HttpServletResponse.SC_NOT_IMPLEMENTED) {
        @Override
        public String getDescription() {
            return "The server either does not recognize the request method, or it lacks the ability to fulfil the request. Usually this implies future availability (e.g., a new feature of a web-service API).";
        }
    },

    SC_BAD_GATEWAY(HttpServletResponse.SC_BAD_GATEWAY) {
        @Override
        public String getDescription() {
            return "The server was acting as a gateway or proxy and received an invalid response from the upstream server.";
        }
    },

    SC_SERVICE_UNAVAILABLE(HttpServletResponse.SC_SERVICE_UNAVAILABLE) {
        @Override
        public String getDescription() {
            return "The server is currently unavailable (because it is overloaded or down for maintenance). Generally, this is a temporary state.";
        }
    },

    SC_GATEWAY_TIMEOUT(HttpServletResponse.SC_GATEWAY_TIMEOUT) {
        @Override
        public String getDescription() {
            return "The server was acting as a gateway or proxy and did not receive a timely response from the upstream server.";
        }
    },

    SC_HTTP_VERSION_NOT_SUPPORTED(HttpServletResponse.SC_HTTP_VERSION_NOT_SUPPORTED) {
        @Override
        public String getDescription() {
            return "The server does not support the HTTP protocol version used in the request.";
        }
    },;

    private final int code;

    private static final Map<Integer, HttpStatusCode> ENUM_MAP;

    HttpStatusCode(int code) {
        this.code = code;
    }

    static {
        Map<Integer, HttpStatusCode> map = new ConcurrentHashMap<>();
        for (HttpStatusCode instance : HttpStatusCode.values()) {
            if (instance == SC_FOUND)
                continue;
            map.put(instance.getCode(), instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static HttpStatusCode getInstance(int code) {
        if (!ENUM_MAP.containsKey(code))
            throw new IllegalArgumentException(String.valueOf(code));
        return ENUM_MAP.get(code);
    }

    public int getCode() {
        return code;
    }

    public static HttpStatusCode getInstance(String value) {
        return Extensions.getEnumFromString(HttpStatusCode.class, value);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(code);
        builder.append(" - ");
        List<String> items = Arrays.stream(this.name().toLowerCase().substring(3).split("_")).map(item -> Character.toUpperCase(item.charAt(0)) + item.substring(1)).collect(Collectors.toList());
        builder.append(String.join(" ", items));
        return builder.toString();
    }
}
