// Generated by view binder compiler. Do not edit!
package com.github.ramonrabello.viewbinding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.github.ramonrabello.viewbinding.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button bindUserButton;

  @NonNull
  public final Guideline bottomGuideline;

  @NonNull
  public final Guideline endGuideline;

  @NonNull
  public final TextInputEditText nameField;

  @NonNull
  public final Guideline startGuideline;

  @NonNull
  public final TextInputEditText surnameField;

  @NonNull
  public final Guideline topGuideline;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button bindUserButton,
      @NonNull Guideline bottomGuideline, @NonNull Guideline endGuideline,
      @NonNull TextInputEditText nameField, @NonNull Guideline startGuideline,
      @NonNull TextInputEditText surnameField, @NonNull Guideline topGuideline) {
    this.rootView = rootView;
    this.bindUserButton = bindUserButton;
    this.bottomGuideline = bottomGuideline;
    this.endGuideline = endGuideline;
    this.nameField = nameField;
    this.startGuideline = startGuideline;
    this.surnameField = surnameField;
    this.topGuideline = topGuideline;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      Button bindUserButton = rootView.findViewById(R.id.bindUserButton);
      if (bindUserButton == null) {
        missingId = "bindUserButton";
        break missingId;
      }
      Guideline bottomGuideline = rootView.findViewById(R.id.bottomGuideline);
      if (bottomGuideline == null) {
        missingId = "bottomGuideline";
        break missingId;
      }
      Guideline endGuideline = rootView.findViewById(R.id.endGuideline);
      if (endGuideline == null) {
        missingId = "endGuideline";
        break missingId;
      }
      TextInputEditText nameField = rootView.findViewById(R.id.nameField);
      if (nameField == null) {
        missingId = "nameField";
        break missingId;
      }
      Guideline startGuideline = rootView.findViewById(R.id.startGuideline);
      if (startGuideline == null) {
        missingId = "startGuideline";
        break missingId;
      }
      TextInputEditText surnameField = rootView.findViewById(R.id.surnameField);
      if (surnameField == null) {
        missingId = "surnameField";
        break missingId;
      }
      Guideline topGuideline = rootView.findViewById(R.id.topGuideline);
      if (topGuideline == null) {
        missingId = "topGuideline";
        break missingId;
      }
      return new ActivityMainBinding((ConstraintLayout) rootView, bindUserButton, bottomGuideline,
          endGuideline, nameField, startGuideline, surnameField, topGuideline);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
