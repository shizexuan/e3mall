package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/**
	生活不止眼前的苟且，
			还有远方的诗和姐~~~
									@眉黛凶兆
									2017年9月25日上午9:50:12
*/
/**
 * 商品管理Controller
 * @author szx
 *
 */
@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable long itemId){
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
}
