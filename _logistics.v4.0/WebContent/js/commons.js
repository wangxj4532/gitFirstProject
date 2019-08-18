$.extend($.fn.datagrid.defaults.editors, {   
    datetimebox: {   
        init: function(container, options){   
            var box = $("<input/>").appendTo(container);   
            box.datetimebox(options);
            return box;   
        },   
        getValue: function(target){   
            return $(target).datetimebox('getValue');   
        },   
        setValue: function(target, value){   
            $(target).datetimebox('setValue',value);
        },   
        resize: function(target, width){   
            var box = $(target);   
			box.datetimebox('resize' , width);
        } ,
        destroy:function(target){
        	$(target).datetimebox('destroy');
        }
    }   
});  







