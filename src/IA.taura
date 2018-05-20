module robo1: {
	in: [ball(r_ball, t_ball), robot(r_robot, t_robot), pole(r_pole, t_pole)];
	out: [walk(r_w, theta_w, phi_w), defend(r_d, theta_d, phi_d), kick(r_k, theta_k, phi_k)];
	var: [float cont, boolean b, boolean c];
	states:[attack, defense, goalkeeper, outro];
	initially: [attack];
	ball#attack ->  if (b == false){
				up(attack);
				emit(walk(cont, 21, 2.0));
				b := false;
				cont := cont+10+1.2;
			}
			else{ 
				up(attack);
				emit(kick(3.0, 4.1, 3.0));
			};

	ball&robot#defense -> if (r_ball+1.0 > 1+1){ 
	                   	up(defense);
			     }
			     else {
			   	up(defense);
				emit(kick(r_w, 2.1, 2.3));
			     };

}
