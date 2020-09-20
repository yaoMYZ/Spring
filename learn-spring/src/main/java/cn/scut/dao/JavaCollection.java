package cn.scut.dao;

import java.util.*;
import lombok.Data;

@Data
public class JavaCollection {
	List<String> addressList;
	Set<String> addressSet;
	Map<String,String> addressMap;
	Properties addressProp;

}
