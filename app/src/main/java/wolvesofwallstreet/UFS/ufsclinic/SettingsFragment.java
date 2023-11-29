package wolvesofwallstreet.UFS.ufsclinic;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingsFragment extends Fragment {
    private ImageButton btnEditProfile;
    private TextView lblName;
    private TextView lblEmail;
    private ImageView iconSetting;
    private ImageView iconArrowSelect;
    private View itemAccount; // include layout reference
    private View itemNotifications; // include layout reference
    private View itemAppearance; // include layout reference
    private View itemPrivacy; // include layout reference
    private View itemSound; // include layout reference
    private View itemLanguage; // include layout reference

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SettingsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SettingsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SettingsFragment newInstance(String param1, String param2) {
        SettingsFragment fragment = new SettingsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_settings, container, false);

        btnEditProfile = myView.findViewById(R.id.btnEditProfile);
        lblName = myView.findViewById(R.id.lblName);
        lblEmail = myView.findViewById(R.id.lblEmail);
        iconSetting = myView.findViewById(R.id.iconSetting);
        iconArrowSelect = myView.findViewById(R.id.iconArrowSelect);
        itemAccount = myView.findViewById(R.id.itemAccount);
        itemNotifications = myView.findViewById(R.id.itemNotifications);
        itemAppearance = myView.findViewById(R.id.itemAppearance);
        itemPrivacy = myView.findViewById(R.id.itemPrivacy);
        itemSound = myView.findViewById(R.id.itemSound);
        itemLanguage = myView.findViewById(R.id.itemLanguage);

        //onClickListeners
         btnEditProfile.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 // Handle edit profile button click
                 Intent editProfileIntent = new Intent(getActivity(), EditProfileActivity.class);
                 startActivity(editProfileIntent);
             }
         });

        // Set user-specific information

        lblName.setText("Nthabiseng");

        lblEmail.setText("2021417219#ufs4life.ac.za");
         itemAccount.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 // Handle click on account settings
                 Intent accountIntent = new Intent(getActivity(), AccountSettingsActivity.class);
                 startActivity(accountIntent);
             }
         });
        itemNotifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click on notification settings
                Intent notificationsIntent = new Intent(getActivity(), NotificationsSettingsActivity.class);

                startActivity(notificationsIntent);
            }
        });
        itemAppearance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click on appearance settings
            }
        });
        itemPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle click on privacy settings
            }
        });
        itemSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click on sound settings
            }
        });
        itemLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle click on language settings
            }
        });

        return myView;

    }
}