package co.edu.icesi.ketal.core;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jgroups.protocols.TransportedVectorTime;

public class NamedEvent implements Event, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private TransportedVectorTime tvt;
	
	private URL local;
	
	private List<URL> target;
	/*
	 * Constructor.
	 */
	public NamedEvent(String event)
	{
		name=event;
		tvt = null;
	}
	
	@Override
	public boolean equals(Event e) {
		
		if(e instanceof NamedEvent)
		{
			return (((NamedEvent)e).name).equals(this.name);
		}
		return false;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public URL getLocalization() {
		return local;
	}

	@Override
	public boolean setLocalization(URL url) {
		local = url;
		return true;
	}

	@Override
	public List<URL> getTargetLocalization() {
		return target;
	}

	@Override
	public boolean setTargetLocalization(List<URL> url) {
		if(target==null){
			target = new ArrayList<>();
		}
		if(url==null){
			return false;
		}
		if(target.isEmpty()){
			target = url;
		}
		return true;
	}

	@Override
	public TransportedVectorTime getTransportedVectorTime() {
		if(tvt != null){
		if(tvt.size()>0){
		return tvt;}}
		return null;
	}

	@Override
	public boolean setTransportedVectorTime(TransportedVectorTime tvt) {
		this.tvt = tvt;
		return true;
	}
	
	public String toString()
	{
		return name;
	}
	
}
