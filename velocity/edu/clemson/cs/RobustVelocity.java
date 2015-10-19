package edu.clemson.cs;

public class RobustVelocity extends Velocity{
	
	protected int xSpeed;
	protected int ySpeed;
	protected int speed;
	protected int direction;

	public RobustVelocity(){
		xSpeed = 0;
		ySpeed = 0;
		speed = 0;
		direction = 0;
	}

	public RobustVelocity(int newSpeed,int newDirection)throws Exception{
		direction = newDirection;
		try{
			if (newSpeed >=0){
				this.setSpeed(newSpeed);
			}
			else{
				throw new Exception();
			}
		}
		catch(Exception e){
			throw e;
		}
		decomposeSpeed();
	}

	public void reverseX(){
		xSpeed = - xSpeed;
		if(direction < 180){
			direction = 180 - direction;
		}
		else{
			direction = 540 - direction;
		}
	}

	public void reverseY(){
		ySpeed = - ySpeed;
		direction = (360 - direction)% 360;
	}


	public void setSpeed(int newSpeed){
		speed = newSpeed;
		decomposeSpeed();
	}

	public void setDirection(int newDirection){
		direction = newDirection;
	}

	public int getDirection(){
		return direction;
	}

	public int getSpeedX(){
		return xSpeed;
	}

	public int getSpeedY(){
		return ySpeed;
	}

	void decomposeSpeed(){
		xSpeed = (int)(Math.cos(direction/57.9)*speed);
		ySpeed = (int)(Math.sin(direction/57.9)*speed);
	}

}
