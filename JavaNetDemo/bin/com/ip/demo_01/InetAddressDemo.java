// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InetAddressDemo.java

package com.ip.demo_01;

import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo
{

	public InetAddressDemo()
	{
	}

	public static void main(String args[])
	{
		try
		{
			InetAddress ia = InetAddress.getByName("PC-201407181200");
			System.out.println((new StringBuilder(String.valueOf(ia.getHostAddress()))).append(" -- ").append(ia.getHostName()).append("  --  ").append(ia.getAddress()).toString());
		}
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
	}
}
