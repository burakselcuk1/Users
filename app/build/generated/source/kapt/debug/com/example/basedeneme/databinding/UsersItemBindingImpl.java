package com.example.basedeneme.databinding;
import com.example.basedeneme.R;
import com.example.basedeneme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UsersItemBindingImpl extends UsersItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.thumbnail, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UsersItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private UsersItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            );
        this.count.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.usersInformation == variableId) {
            setUsersInformation((com.example.basedeneme.model.UsersItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUsersInformation(@Nullable com.example.basedeneme.model.UsersItem UsersInformation) {
        this.mUsersInformation = UsersInformation;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.usersInformation);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String usersInformationName = null;
        int usersInformationUserId = 0;
        com.example.basedeneme.model.UsersItem usersInformation = mUsersInformation;

        if ((dirtyFlags & 0x3L) != 0) {



                if (usersInformation != null) {
                    // read usersInformation.name
                    usersInformationName = usersInformation.getName();
                    // read usersInformation.userId
                    usersInformationUserId = usersInformation.getUserId();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.count.setText(usersInformationUserId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, usersInformationName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): usersInformation
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}