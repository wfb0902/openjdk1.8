package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ServerManagerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/cygwin64/tmp/openjdk-jdk8u-windows-x64-hotspot/workspace/build/src/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Monday, June 3, 2019 9:12:51 PM UTC
*/


/** Interface used to combine the Activator and Locator when both are
    * implemented together in the same process, as is currently the case
    * for our implementation.
    */
public final class ServerManagerHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.ServerManager value = null;

  public ServerManagerHolder ()
  {
  }

  public ServerManagerHolder (com.sun.corba.se.PortableActivationIDL.ServerManager initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.ServerManagerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.ServerManagerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.ServerManagerHelper.type ();
  }

}
