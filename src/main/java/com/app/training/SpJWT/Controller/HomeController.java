package com.app.training.SpJWT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.learning.SpJWT.Util.JwtTokenUtil;
import com.app.training.SpJWT.Model.JwtRequest;
import com.app.training.SpJWT.Model.JwtResponse;
import com.app.training.SpJWT.Service.JwtUserDetailService;

//@RequestMapping("/jwt")
@RestController
@CrossOrigin()
public class HomeController {


	@RequestMapping({"/home"})
	public String Home() {//
		return "Hello world, welcom to JWT home";
	}

	/*// @RequestMapping(value = "", method = RequestMethod.POST)
	@PostMapping("/auth")
	public ResponseEntity<?> createToken(@RequestBody JwtRequest authRequest) throws Exception {

		authenticate(authRequest.getUserName(), authRequest.getUserPassword());

		final UserDetails jwtUserService = userDetailService.loadUserByUsername(authRequest.getUserName());
		
		final String jwtToken = jwtTokenUtil.generateToken(jwtUserService);
		
		return ResponseEntity.ok(new JwtResponse(jwtToken));

	}
	
	private void authenticate(String userName, String password) throws Exception {
		try {
			authManager.authenticate(
					new UsernamePasswordAuthenticationToken(userName, password));

		} catch (BadCredentialsException ex) {
			
			throw new Exception("Incorrect username or password", ex);
		}catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		}
	}
	*/
}
