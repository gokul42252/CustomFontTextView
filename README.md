# CustomFontTextView

<h1>Create Custom textview android with typeface example</h1>
&nbsp;

<img src="http://thoughtnerds.com/wp-content/uploads/2018/03/Create-Custom-textview-android-with-typeface-example-169x300.jpeg" alt="Create Custom textview android with typeface example" width="229" height="407" class="alignnone  wp-image-700" />

In this tutorial, we can learn how to customise Textview to hold a custom font and can use the textview in the whole project.

<strong>STEP 1:-</strong>First of all create the<span> </span><strong>Assets Folder</strong><em> </em>if it's not created already, Copy the font you want to use in your project.

<img src="http://thoughtnerds.com/wp-content/uploads/2018/03/Screenshot-73.png" alt="" width="235" height="106" class="alignnone size-full wp-image-697" />

<strong>STEP 2</strong>:- Create an attrs,xml in in <strong>res/values </strong>
<pre><span>&lt;?</span><span>xml version=</span><span>"1.0" </span><span>encoding=</span><span>"utf-8"</span><span>?&gt;
</span><span>&lt;resources&gt;
</span><span>    &lt;declare-styleable </span><span>name=</span><span>"CustomFontTextView"</span><span>&gt;
</span><span>        &lt;attr </span><span>name=</span><span>"fontName" </span><span>format=</span><span>"string" </span><span>/&gt;
</span><span>    &lt;/declare-styleable&gt;
</span><span>&lt;/resources&gt;

<img src="http://thoughtnerds.com/wp-content/uploads/2018/03/Screenshot-74.png" alt="" width="242" height="196" class="alignnone size-full wp-image-698" />
</span></pre>
<strong>STEP 3</strong>:- Create a Java class <span>CustomFontTextView.java </span>
<pre><span>public class </span>CustomFontTextView <span>extends </span>AppCompatTextView {
    <span>public </span><span>CustomFontTextView</span>(Context context) {
        <span>super</span>(context)<span>;
</span><span>    </span>}

    <span>public </span><span>CustomFontTextView</span>(Context context<span>, </span>AttributeSet attrs) {
        <span>super</span>(context<span>, </span>attrs)<span>;
</span><span>        </span>init(context<span>, </span>attrs)<span>;
</span><span>    </span>}


    <span>public </span><span>CustomFontTextView</span>(Context context<span>, </span>AttributeSet attrs<span>, int </span>defStyleAttr) {
        <span>super</span>(context<span>, </span>attrs<span>, </span>defStyleAttr)<span>;
</span><span>        </span>init(context<span>, </span>attrs)<span>;
</span><span>    </span>}

    <span>private void </span><span>init</span>(Context context<span>, </span>AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs<span>,
</span><span>                </span>R.styleable.<span>CustomFontTextView</span><span>, </span><span>0</span><span>, </span><span>0</span>)<span>;
</span><span>        </span>String fontName = a.getString(R.styleable.<span>CustomFontTextView_fontName</span>)<span>;
</span><span>        </span>Typeface face = <span>null;
</span><span>        if </span>(fontName != <span>null </span>&amp;&amp; !TextUtils.<span>isEmpty</span>(fontName)) {
            face = Typeface.<span>createFromAsset</span>(context.getAssets()<span>, </span>fontName)<span>;
</span><span>        </span>} <span>else </span>{
            face = Typeface.<span>createFromAsset</span>(context.getAssets()<span>, </span><span>"Steelworks Vintage Demo.ttf"</span>)<span>;
</span><span>        </span>}
        <span>this</span>.setTypeface(face)<span>;
</span><span>        </span>a.recycle()<span>;
</span><span>    </span>}
}</pre>
<strong>STEP 4</strong>:- Then create main_activity.xml like below
<pre><span>&lt;com.cretlabs.customfonttextview.customviews.CustomFontTextView
</span><span>    </span><span>android</span><span>:layout_width=</span><span>"match_parent"
</span><span>    </span><span>android</span><span>:layout_height=</span><span>"wrap_content"
</span><span>    </span><span>android</span><span>:layout_margin=</span><span>"12dp"
</span><span>    </span><span>android</span><span>:layout_marginBottom=</span><span>"8dp"
</span><span>    </span><span>android</span><span>:layout_marginTop=</span><span>"8dp"
</span><span>    </span><span>android</span><span>:gravity=</span><span>"center"
</span><span>    </span><span>android</span><span>:text=</span><span>"@string/app_name"
</span><span>    </span><span>android</span><span>:textSize=</span><span>"20sp"
</span><span>    </span><span>app</span><span>:fontName=</span><span>"@string/steel_work_font"
</span><span>    </span><span>app</span><span>:layout_constraintBottom_toBottomOf=</span><span>"parent"
</span><span>    </span><span>app</span><span>:layout_constraintTop_toTopOf=</span><span>"parent"
</span><span>    </span><span>tools</span><span>:layout_editor_absoluteX=</span><span>"12dp"
</span><span>    </span><span>tools</span><span>:ignore=</span><span>"MissingConstraints" </span><span>/&gt;</span></pre>
<strong>STEP 5:-</strong>Add your font file name in strings.xml
<pre><span>&lt;string </span><span>name=</span><span>"steel_work_font"</span><span>&gt;</span>Steelworks Vintage Demo.ttf<span>&lt;/string&gt;</span></pre>
Add font name to Custom text view in activity_main.xml like below

<span>app</span><span>:fontName=</span><span>"@string/steel_work_font"</span>

<img src="http://thoughtnerds.com/wp-content/uploads/2018/03/Screenshot-75-192x300.png" alt="" width="300" height="469" class="alignnone  wp-image-699" />

As you wish, you can add multiple fonts to assets and use one by one in your project.



See full article http://thoughtnerds.com/create-custom-textview-android-typeface-example/

