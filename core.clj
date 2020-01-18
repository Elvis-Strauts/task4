(ns majasdarbs4.core)

(defn firstlist [vars] 

  (float 
    (/  
      ( reduce + 
               ( map (fn[x] (val x))
                     ( filter (fn[k] (.endsWith (key k) "a")) vars )
               )
      )
      
      ( count
        ( filter (fn[k] (.endsWith (key k) "a")) vars)
      )
    ) 
  )
)