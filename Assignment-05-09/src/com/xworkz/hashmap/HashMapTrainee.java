package com.xworkz.hashmap;

import javax.management.ObjectInstance;

public class HashMapTrainee {
	
	private int traineeId;
	private String traineeName;
	
	
	public HashMapTrainee(int traineeId, String traineeName) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
	}


	public int getTraineeId() {
		return traineeId;
	}


	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}


	public String getTraineeName() {
		return traineeName;
	}


	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}


	@Override
	public String toString() {
		return "HashMapTrainee [traineeId=" + traineeId + ", traineeName=" + traineeName + "]";
	}
	
	/*
	@Override
	public boolean equals(Object obj) {
		if(obj==null)      //t1.equals(null
			return false;
		if(!(obj instanceof HashMapTrainee))  //t1.equals(Tree)
			return false;
			if(obj==this) //t1.equals(t2)
		    return true;
			return(this.getTraineeId()==((HashMapTrainee)obj).getTraineeId()
					&&(this.getTraineeName()==((HashMapTrainee)obj).getTraineeName()));

	}
	@Override
	public int hashCode() {
		return TraineeId();
	}*/


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + traineeId;
		result = prime * result + ((traineeName == null) ? 0 : traineeName.hashCode());
		return result;
		}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapTrainee other = (HashMapTrainee) obj;
		if (traineeId != other.traineeId)
			return false;
		if (traineeName == null) {
			if (other.traineeName != null)
				return false;
		} else if (!traineeName.equals(other.traineeName))
			return false;
		return true;
	}
	
	
	

}
