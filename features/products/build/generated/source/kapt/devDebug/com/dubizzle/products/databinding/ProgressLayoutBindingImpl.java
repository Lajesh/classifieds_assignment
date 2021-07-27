package com.dubizzle.products.databinding;
import com.dubizzle.products.R;
import com.dubizzle.products.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProgressLayoutBindingImpl extends ProgressLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProgressLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View[] root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private ProgressLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View[] root, Object[] bindings) {
        super(bindingComponent, root[0], 0
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.showProgress == variableId) {
            setShowProgress((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShowProgress(@Nullable java.lang.Boolean ShowProgress) {
        this.mShowProgress = ShowProgress;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.showProgress);
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
        boolean androidxDatabindingViewDataBindingSafeUnboxShowProgress = false;
        java.lang.Boolean showProgress = mShowProgress;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(showProgress)
                androidxDatabindingViewDataBindingSafeUnboxShowProgress = androidx.databinding.ViewDataBinding.safeUnbox(showProgress);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView0.setClickable(androidxDatabindingViewDataBindingSafeUnboxShowProgress);
            this.mboundView0.setFocusable(androidxDatabindingViewDataBindingSafeUnboxShowProgress);
            com.dubizzle.core.common.BindingAdapter.setVisibility(this.mboundView0, showProgress);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): showProgress
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}