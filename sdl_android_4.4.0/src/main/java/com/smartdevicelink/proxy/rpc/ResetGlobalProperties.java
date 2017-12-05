package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;
import com.smartdevicelink.proxy.rpc.enums.GlobalProperty;

import java.util.Hashtable;
import java.util.List;

/**
 * Resets the passed global properties to their default values as defined by
 * SDL
 * <p></p>
 * The HELPPROMPT global property default value is generated by SDL consists of
 * the first vrCommand of each Command Menu item defined at the moment PTT is
 * pressed
 * <p>The TIMEOUTPROMPT global property default value is the same as the HELPPROMPT
 * global property default value</p>
 * 
 * <p><b>HMILevel needs to be FULL, LIMITED or BACKGROUND</b></p>
 * 
 * 
 * <p><b>Parameter List</b></p>
 * <table border="1" rules="all">
 * 		<tr>
 * 			<th>Param Name</th>
 * 			<th>Type</th>
 * 			<th>Description</th>
 *                 <th> Req.</th>
 * 			<th>Notes</th>
 * 			<th>Version Available</th>
 * 		</tr>
 * 		<tr>
 * 			<td>properties</td>
 * 			<td>GlobalProperty</td>
 * 			<td>An array of one or more GlobalProperty enumeration elements indicating which global properties to reset to their default value.</td>
 *                 <td>Y</td>
 * 			<td>Array must have at least one element.; minsize:1; maxsize:100</td>
 * 			<td>SmartDeviceLink 1.0</td>
 * 		</tr>
 *
 *  </table>
 *  <p><b>Response</b></p>
 *  
 * <p>Indicates whether the Global Properties were successfully set to their default values.</p>
 * 
 * <p><b>Non-default Result Codes:</b></p>
 * 
 * <p>	SUCCESS</p>
 * 	<p>INVALID_DATA</p>
 * <p>	OUT_OF_MEMORY</p>
 *  <p>	TOO_MANY_PENDING_REQUESTS</p>
 * <p>	APPLICATION_NOT_REGISTERED</p>
 * <p>	GENERIC_ERROR </p>     
 * <p>	REJECTED </p>
 * 	<p>DISALLOWED    </p>
 * @since SmartDeviceLink 1.0
 * @see SetGlobalProperties
 */
public class ResetGlobalProperties extends RPCRequest {
	public static final String KEY_PROPERTIES = "properties";
	/**
	 * Constructs a new ResetGlobalProperties object
	 */
    public ResetGlobalProperties() {
        super(FunctionID.RESET_GLOBAL_PROPERTIES.toString());
    }
	/**
	 * Constructs a new ResetGlobalProperties object indicated by the Hashtable
	 * parameter
	 * 
	 * 
	 * @param hash
	 *            The Hashtable to use
	 */    
    public ResetGlobalProperties(Hashtable<String, Object> hash) {
        super(hash);
    }
	/**
	 * Gets an array of one or more GlobalProperty enumeration elements
	 * indicating which global properties to reset to their default value
	 * 
	 * @return List<GlobalProperty> -an array of one or more GlobalProperty
	 *         enumeration elements
	 */    
    @SuppressWarnings("unchecked")
    public List<GlobalProperty> getProperties() {
		return (List<GlobalProperty>) getObject(GlobalProperty.class, KEY_PROPERTIES);
    }
	/**
	 * Sets an array of one or more GlobalProperty enumeration elements
	 * indicating which global properties to reset to their default value
	 * 
	 * @param properties
	 *            a List<GlobalProperty> An array of one or more
	 *            GlobalProperty enumeration elements indicating which global
	 *            properties to reset to their default value
	 *            <p></p>
	 *            <b>Notes: </b>Array must have at least one element
	 */    
    public void setProperties( List<GlobalProperty> properties ) {
		setParameters(KEY_PROPERTIES, properties);
    }
}