package com.marsjiang.gotit.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.RemoteViews;

import com.marsjiang.gotit.R;

public class NotificationService extends Service {
	
	private int mID = 10001;
	@Override
	public IBinder onBind(Intent intent) {
	
		return null;
	}

	@Override
	public void onCreate() {
		System.out.println("通知服务开启");
		Notification notification = new Notification();
		notification.icon = R.drawable.ic_launcher;
		notification.contentView = new RemoteViews(getPackageName(), R.layout.notification_item);
		
		startForeground(mID , notification);
		}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		//super.onDestroy();
		stopForeground(true);
	}
}
