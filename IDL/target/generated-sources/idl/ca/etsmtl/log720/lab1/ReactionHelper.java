package ca.etsmtl.log720.lab1;


/**
 *	Generated from IDL interface "Reaction"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class ReactionHelper
{
	public static void insert (final org.omg.CORBA.Any any, final ca.etsmtl.log720.lab1.Reaction s)
	{
			any.insert_Object(s);
	}
	public static ca.etsmtl.log720.lab1.Reaction extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:ca/etsmtl/log720/lab1/Reaction:1.0", "Reaction");
	}
	public static String id()
	{
		return "IDL:ca/etsmtl/log720/lab1/Reaction:1.0";
	}
	public static Reaction read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final ca.etsmtl.log720.lab1.Reaction s)
	{
		_out.write_Object(s);
	}
	public static ca.etsmtl.log720.lab1.Reaction narrow(final java.lang.Object obj)
	{
		if (obj instanceof ca.etsmtl.log720.lab1.Reaction)
		{
			return (ca.etsmtl.log720.lab1.Reaction)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static ca.etsmtl.log720.lab1.Reaction narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (ca.etsmtl.log720.lab1.Reaction)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:ca/etsmtl/log720/lab1/Reaction:1.0"))
			{
				ca.etsmtl.log720.lab1._ReactionStub stub;
				stub = new ca.etsmtl.log720.lab1._ReactionStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static ca.etsmtl.log720.lab1.Reaction unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (ca.etsmtl.log720.lab1.Reaction)obj;
		}
		catch (ClassCastException c)
		{
				ca.etsmtl.log720.lab1._ReactionStub stub;
				stub = new ca.etsmtl.log720.lab1._ReactionStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
