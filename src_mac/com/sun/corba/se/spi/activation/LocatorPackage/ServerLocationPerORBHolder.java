package com.sun.corba.se.spi.activation.LocatorPackage;

/**
* com/sun/corba/se/spi/activation/LocatorPackage/ServerLocationPerORBHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/jenkins/workspace/build-scripts/jobs/jdk8u/jdk8u-mac-x64-hotspot/workspace/build/src/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, June 3, 2019 2:11:57 PM PDT
*/

public final class ServerLocationPerORBHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB value = null;

  public ServerLocationPerORBHolder ()
  {
  }

  public ServerLocationPerORBHolder (com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORBHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORBHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORBHelper.type ();
  }

}
