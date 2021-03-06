package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.proxy.RPCStruct;

import java.util.Hashtable;

public class HMICapabilities extends RPCStruct{
    public static final String KEY_NAVIGATION = "navigation";
    public static final String KEY_PHONE_CALL = "phoneCall";
    public static final String KEY_VIDEO_STREAMING = "videoStreaming";
    public static final String KEY_REMOTE_CONTROL = "remoteControl";

	public HMICapabilities() { }
	  
	 public HMICapabilities(Hashtable<String, Object> hash) {
		 super(hash);
	 }
	 
	 public boolean isNavigationAvailable(){
		 Object available = getValue(KEY_NAVIGATION);
		 if(available == null){
			 return false;
		 }
		 return (Boolean)available;
	 }
	 
	 public void setNavigationAvilable(Boolean available){
		 setValue(KEY_NAVIGATION, available);
	 }
	 
	 public boolean isPhoneCallAvailable(){
		 Object available = getValue(KEY_PHONE_CALL);
		 if(available == null){
			 return false;
		 }
		 return (Boolean)available;
	 }
	 
	 public void setPhoneCallAvilable(Boolean available){
		 setValue(KEY_PHONE_CALL, available);
	 }

	public boolean isVideoStreamingAvailable(){
		Object available = getValue(KEY_VIDEO_STREAMING);
		if(available == null){
			return false;
		}
		return (Boolean)available;
	}

	public void setVideoStreamingAvailable(Boolean available){
		setValue(KEY_VIDEO_STREAMING, available);
	}

	public boolean isRemoteControlAvailable(){
		Object available = getValue(KEY_REMOTE_CONTROL);
		if(available == null){
			return false;
		}
		return (Boolean)available;
	}

	public void setRemoteControlAvailable(Boolean available){
		setValue(KEY_REMOTE_CONTROL, available);
	}


}
