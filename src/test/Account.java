package test;
import java.util.*;
public class Account {
protected  long accnum;
protected double accbal;
public long getAccnum() {
	return accnum;
}
public void setAccnum(long accnum) {
	this.accnum = accnum;
}
public double getAccbal() {
	return accbal;
}
public void setAccbal(double accbal) {
	this.accbal = accbal;
}
public Account(long accnum) {
	accbal=0;
}
}
