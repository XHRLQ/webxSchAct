package com.luoqing.learning.app1.resource;

import com.luoqing.learning.app1.model.Activity;
import com.luoqing.learning.app1.model.Catgory;
import com.luoqing.learning.app1.model.ClientActivity;

import java.util.Date;
import java.util.List;

public interface ActivityMapper {

    public int insertActivity(Activity activity);

    public int deleteActivity(Activity activity);

    public int closeAcitivity(long activityId);

    public List<Activity> selectActivities();

    public List<Activity> selectActivitiesByInstitution(String institution);

    public List<Activity> selectActivitiesByCatgoryId(long catgoryId);

    public List<Activity> selectActivitiesByDate(Date startDate,Date endDate);

    public List<Activity> selectActivityById(long activityId);

    public List<Activity> selectActivitiesByCreator(long clientId);

    public List<Activity> selectActivitiesByParticipator(long clientId);

    public List<Activity> selectActivityByClientIdAndActivityId(long clientId,long activityId);



}
