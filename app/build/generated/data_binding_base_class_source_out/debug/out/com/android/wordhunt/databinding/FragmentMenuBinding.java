// Generated by view binder compiler. Do not edit!
package com.android.wordhunt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.wordhunt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMenuBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button playButton;

  @NonNull
  public final Button statsButton;

  @NonNull
  public final TextView titleTextView;

  @NonNull
  public final Button tutorialButton;

  private FragmentMenuBinding(@NonNull RelativeLayout rootView, @NonNull Button playButton,
      @NonNull Button statsButton, @NonNull TextView titleTextView,
      @NonNull Button tutorialButton) {
    this.rootView = rootView;
    this.playButton = playButton;
    this.statsButton = statsButton;
    this.titleTextView = titleTextView;
    this.tutorialButton = tutorialButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.playButton;
      Button playButton = ViewBindings.findChildViewById(rootView, id);
      if (playButton == null) {
        break missingId;
      }

      id = R.id.statsButton;
      Button statsButton = ViewBindings.findChildViewById(rootView, id);
      if (statsButton == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      id = R.id.tutorialButton;
      Button tutorialButton = ViewBindings.findChildViewById(rootView, id);
      if (tutorialButton == null) {
        break missingId;
      }

      return new FragmentMenuBinding((RelativeLayout) rootView, playButton, statsButton,
          titleTextView, tutorialButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
