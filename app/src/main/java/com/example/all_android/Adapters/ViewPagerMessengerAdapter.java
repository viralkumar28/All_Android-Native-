package com.example.all_android.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.all_android.TabFragments.CallsFragment;
import com.example.all_android.TabFragments.ChatFragment;
import com.example.all_android.TabFragments.StatusFragment;
import org.jetbrains.annotations.NotNull;

public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {
    public ViewPagerMessengerAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
       if(position == 0){
           return new ChatFragment();
       }else if(position ==1){
           return new StatusFragment();
       }else{
           return new CallsFragment();
       }
    }

    @Override
    public int getCount() {
        return 3; //number of tabs
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Chats";
        }else if(position ==1){
            return "Status";
        }else{
            return "Calls";
        }
    }
}
