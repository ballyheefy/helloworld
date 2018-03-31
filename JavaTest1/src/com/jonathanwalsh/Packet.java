package com.jonathanwalsh;


/**
 * 
 * @author jonth
 * 
 * This is the start of the class for a router there is no such thing as a packet but my router application can deal with these generically 
 * 
 * TODO - need to understand how declare interfaces to this 
 *
 */

public abstract class Packet {
	
	/*
	 * Default constructor 
	 */
	public Packet() {
		
	}
	
	
	/*
	 *  Private state
	 */
	
	public int get_timeAlive() {
		return _timeAlive;
	}
	public void set_timeAlive(int _timeAlive) {
		this._timeAlive = _timeAlive;
	}


	public int get_size() {
		return _size;
	}


	public void set_size(int _size) {
		this._size = _size;
	}


	public int get_maxhops() {
		return _maxhops;
	}


	public void set_maxhops(int _maxhops) {
		this._maxhops = _maxhops;
	}


	private int _timeAlive; 
	private int _maxhops;
	private int _size;
	
	
}
