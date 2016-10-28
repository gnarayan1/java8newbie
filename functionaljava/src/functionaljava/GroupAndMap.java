package functionaljava;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Claim;

public class GroupAndMap {
	
	static void imperativeGroupBy(List<Claim> claims) {
		Map<String, List<Integer>> resultMap = new HashMap<String, List<Integer>>();
		for (Claim claim : claims) {
			if (resultMap.get(claim.getMemberId()) == null) {
				List<Integer> claimList = new ArrayList<Integer>();
				claimList.add(claim.getClaimId());
				resultMap.put(claim.getMemberId(), claimList);
			} else {
				resultMap.get(claim.getMemberId()).add(claim.getClaimId());
			}			
		}
		System.out.println(resultMap);
		
	}
	
	
	static void declarativeGroupBy(List<Claim> claims) {
		System.out
		.println(claims.stream().collect(groupingBy(Claim::getMemberId, mapping(Claim::getClaimId, toList()))));
	}
	

	public static void main(String[] args) {
		List<Claim> claims = Arrays.asList(
				new Claim(1, "Member1", "Joe", 100.0, "05/01/2016"),
				new Claim(2, "Member2", "Jane", 100.0, "06/01/2016"),
				new Claim(3, "Member1", "Joe", 500.0, "07/01/2016"),
				new Claim(4, "Member3", "Jill", 600.0, "05/03/2016"),
				new Claim(5, "Member2", "Jane", 600.0, "07/03/2016"),
				new Claim(6, "Member4", "Jane", 600.0, "07/03/2016"));

		imperativeGroupBy(claims);
		
		declarativeGroupBy(claims);
		
	}
	

}
