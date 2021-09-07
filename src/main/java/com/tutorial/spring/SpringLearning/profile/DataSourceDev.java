package com.tutorial.spring.SpringLearning.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * we can customize each bean class with profiles
 * eg. this bean work only for dev env
 * if there is no profile then it assumes default profile
 */
@Repository
@Profile("dev")
public class DataSourceDev {


}
