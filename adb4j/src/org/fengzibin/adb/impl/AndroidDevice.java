package org.fengzibin.adb.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import org.fengzibin.adb.IResult;

/** 
* @author fengzibin
*/
public final class AndroidDevice extends Device {

	AndroidDevice(String serialNumber, Status status) {
		super(serialNumber, status);
	}

}
