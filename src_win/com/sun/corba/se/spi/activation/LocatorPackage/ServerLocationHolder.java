package com.sun.corba.se.spi.activation.LocatorPackage;

/**
* com/sun/corba/se/spi/activation/LocatorPackage/ServerLocationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/cygwin64/tmp/openjdk-jdk8u-windows-x64-hotspot/workspace/build/src/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, June 3, 2019 9:12:51 PM UTC
*/

public final class ServerLocationHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.LocatorPackage.ServerLocation value = null;

  public ServerLocationHolder ()
  {
  }

  public ServerLocationHolder (com.sun.corba.se.spi.activation.LocatorPackage.ServerLocation initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationHelper.type ();
  }

}
