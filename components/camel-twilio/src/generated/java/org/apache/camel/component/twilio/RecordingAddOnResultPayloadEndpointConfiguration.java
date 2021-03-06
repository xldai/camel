
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.recording.addonresult.Payload}.
 */
@ApiParams(apiName = "recording-add-on-result-payload", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "deleter", description="Create a PayloadDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.recording.addonresult.PayloadDeleter deleter(String pathReferenceSid, String pathAddOnResultSid, String pathSid)", "com.twilio.rest.api.v2010.account.recording.addonresult.PayloadDeleter deleter(String pathAccountSid, String pathReferenceSid, String pathAddOnResultSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a PayloadFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.recording.addonresult.PayloadFetcher fetcher(String pathReferenceSid, String pathAddOnResultSid, String pathSid)", "com.twilio.rest.api.v2010.account.recording.addonresult.PayloadFetcher fetcher(String pathAccountSid, String pathReferenceSid, String pathAddOnResultSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a PayloadReader to execute read", signatures={"com.twilio.rest.api.v2010.account.recording.addonresult.PayloadReader reader(String pathReferenceSid, String pathAddOnResultSid)", "com.twilio.rest.api.v2010.account.recording.addonresult.PayloadReader reader(String pathAccountSid, String pathReferenceSid, String pathAddOnResultSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class RecordingAddOnResultPayloadEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The SID of the AddOnResult to which the payloads to delete belongs"), @ApiMethod(methodName = "deleter", description="The SID of the AddOnResult to which the payloads to delete belongs"), @ApiMethod(methodName = "fetcher", description="The SID of the AddOnResult to which the payload to fetch belongs"), @ApiMethod(methodName = "fetcher", description="The SID of the AddOnResult to which the payloads to delete belongs"), @ApiMethod(methodName = "reader", description="The SID of the AddOnResult to which the payloads to read belongs"), @ApiMethod(methodName = "reader", description="The SID of the AddOnResult to which the payloads to delete belongs")})
    private String pathAddOnResultSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The SID of the recording to which the AddOnResult resource that contains the payloads to delete belongs"), @ApiMethod(methodName = "deleter", description="The SID of the recording to which the AddOnResult resource that contains the payloads to delete belongs"), @ApiMethod(methodName = "fetcher", description="The SID of the recording to which the AddOnResult resource that contains the payload to fetch belongs"), @ApiMethod(methodName = "fetcher", description="The SID of the recording to which the AddOnResult resource that contains the payloads to delete belongs"), @ApiMethod(methodName = "reader", description="The SID of the recording to which the AddOnResult resource that contains the payloads to read belongs"), @ApiMethod(methodName = "reader", description="The SID of the recording to which the AddOnResult resource that contains the payloads to delete belongs")})
    private String pathReferenceSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource to fetch")})
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathAddOnResultSid() {
        return pathAddOnResultSid;
    }

    public void setPathAddOnResultSid(String pathAddOnResultSid) {
        this.pathAddOnResultSid = pathAddOnResultSid;
    }

    public String getPathReferenceSid() {
        return pathReferenceSid;
    }

    public void setPathReferenceSid(String pathReferenceSid) {
        this.pathReferenceSid = pathReferenceSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
