package nz.ac.auckland.concert.services;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/services")
public class ConcertApplication extends Application {
	private Set<Class<?>> _classes = new HashSet<Class<?>>();
	private Set<Object> _singletons = new HashSet<Object>();

	public ConcertApplication() {
		_singletons.add(new ConcertResource());
		_classes.add(SerializationMessageBodyReaderAndWriter.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return _classes;
	}

	@Override
	public Set<Object> getSingletons()
	{
		return _singletons;
	}
}

